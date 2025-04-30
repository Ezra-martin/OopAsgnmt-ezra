package MissionManagementSystem;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

    public class main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false); // Strict format checking

            // Create sample personnel
            Personnel p1 = new Personnel("P001", "Alice", "Medic");
            Personnel p2 = new Personnel("P002", "Bob", "Soldier");
            Personnel p3 = new Personnel("P003", "Charlie", "Logistics Officer");

            // Create sample resources
            List<Resource> resources = new ArrayList<>();
            resources.add(new Resource("R001", "Drone", 2, "Equipment"));
            resources.add(new Resource("R002", "Ambulance", 1, "Vehicle"));
            resources.add(new Resource("R003", "Medical Kit", 3, "Medical Supplies"));
            resources.add(new Resource("R004", "Ammunition", 5, "Weapon"));
            resources.add(new Resource("R005", "Vehicle", 2, "Transport"));
            resources.add(new Resource("R006", "Food Supplies", 4, "Supplies"));

            try {
                // Read mission type with validation
                String missionType = "";
                while (true) {
                    System.out.println("Enter mission type (Recon/Rescue/Combat/Humanitarian):");
                    missionType = scanner.nextLine().trim().toLowerCase();
                    if (missionType.equals("recon") || missionType.equals("rescue")
                            || missionType.equals("combat") || missionType.equals("humanitarian")) {
                        break;
                    } else {
                        System.out.println("Invalid mission type. Please enter one of the options.");
                    }
                }

                // ===== VALIDATION: Mission ID =====
                String id;
                while (true) {
                    System.out.println("Enter mission ID (letters and digits only):");
                    id = scanner.nextLine().trim();
                    if (!id.isEmpty() && id.matches("^[a-zA-Z0-9]+$")) {
                        break;
                    } else {
                        System.out.println("Invalid ID. Only letters and numbers are allowed. No spaces or special characters.");
                    }
                }

                // ===== VALIDATION: Mission Name =====
                String name;
                while (true) {
                    System.out.println("Enter mission name (min 3 characters, letters/numbers/spaces only):");
                    name = scanner.nextLine().trim();
                    if (!name.isEmpty() && name.length() >= 3 && name.matches("^[a-zA-Z0-9 ]+$")) {
                        break;
                    } else {
                        System.out.println("Invalid name. Must be at least 3 characters and only contain letters, digits, or spaces.");
                    }
                }

                // Mission Dates with full validation
                Date startDate = null;
                Date endDate = null;

                while (startDate == null) {
                    System.out.println("Enter start date (yyyy-MM-dd):");
                    String startInput = scanner.nextLine().trim();
                    try {
                        startDate = dateFormat.parse(startInput);
                    } catch (ParseException e) {
                        System.out.println("Invalid date format. Please use yyyy-MM-dd.");
                    }
                }

                while (endDate == null) {
                    System.out.println("Enter end date (yyyy-MM-dd):");
                    String endInput = scanner.nextLine().trim();
                    try {
                        endDate = dateFormat.parse(endInput);
                        if (endDate.before(startDate)) {
                            System.out.println("End date must be after start date. Try again.");
                            endDate = null;
                        }
                    } catch (ParseException e) {
                        System.out.println("Invalid date format. Please use yyyy-MM-dd.");
                    }
                }

                // Create Mission based on type
                Mission mission = null;
                switch (missionType) {
                    case "recon":
                        mission = new ReconMission(id, name, startDate, endDate);
                        mission.addPersonnel(p1);
                        mission.addPersonnel(p2);
                        break;
                    case "rescue":
                        mission = new RescueMission(id, name, startDate, endDate);
                        mission.addPersonnel(p1);
                        break;
                    case "combat":
                        mission = new CombatMission(id, name, startDate, endDate);
                        mission.addPersonnel(p1);
                        mission.addPersonnel(p2);
                        mission.addPersonnel(p3);
                        break;
                    case "humanitarian":
                        mission = new HumanitarianMission(id, name, startDate, endDate);
                        mission.addPersonnel(p1);
                        mission.addPersonnel(p3);
                        break;
                }

                // Perform mission operations
                mission.assignTask();
                mission.allocateResources(resources);
                mission.trackMissionProgress();

                // ===== Custom Manual Report Section =====
                System.out.print("Would you like to create a custom mission report? (yes/no): ");
                String createReport = scanner.nextLine().trim();

                if (createReport.equalsIgnoreCase("yes")) {
                    System.out.print("Enter mission name: ");
                    String reportMissionName = scanner.nextLine();

                    System.out.print("Enter mission status: ");
                    String reportMissionStatus = scanner.nextLine();

                    System.out.print("Enter personnel involved: ");
                    String reportPersonnel = scanner.nextLine();

                    System.out.print("Enter additional comments: ");
                    String reportComments = scanner.nextLine();

                    System.out.print("Enter the filename for your report (e.g., Report1.txt): ");
                    String fileName = scanner.nextLine();

                    // Build report content
                    String reportContent = "=== Custom Humanitarian Mission Report ===\n"
                            + "Mission: " + reportMissionName + "\n"
                            + "Status: " + reportMissionStatus + "\n"
                            + "Personnel: " + reportPersonnel + "\n"
                            + "Comments: " + reportComments + "\n";

                    // Save to file
                    try {
                        FileWriter writer = new FileWriter(fileName);
                        writer.write(reportContent);
                        writer.close();
                        System.out.println("\nReport saved successfully as '" + fileName + "'.");
                    } catch (IOException e) {
                        System.out.println("An error occurred while saving the report.");
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Mission report creation skipped.");
                }

            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
    }



