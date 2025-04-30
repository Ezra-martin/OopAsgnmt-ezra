package MissionManagementSystem;

import java.util.Date;
import java.util.List;

    public class RescueMission extends Mission {
        public RescueMission(String id, String name, Date startDate, Date endDate) {
            super(id, name, startDate, endDate);
        }

        @Override
        public void assignTask() {
            boolean hasMedic = assignedPersonnel.stream()
                    .anyMatch(p -> p.getPersonnelRole().equalsIgnoreCase("Medic"));

            if (!hasMedic) {
                System.out.println("Error: RescueMission requires at least one Medic.");
                return;
            }

            System.out.println("Rescue, medical, and logistics tasks assigned.");
        }

        @Override
        public void allocateResources(List<Resource> resources) {
            boolean hasMedKit = false;
            boolean hasAmbulance = false;

            for (Resource res : resources) {
                if (res.getResourceName().equalsIgnoreCase("Medical Kit") && res.isAvailable(1)) {
                    res.allocate(1);
                    hasMedKit = true;
                }
                if (res.getResourceName().equalsIgnoreCase("Ambulance") && res.isAvailable(1)) {
                    res.allocate(1);
                    hasAmbulance = true;
                }
            }

            if (!hasMedKit || !hasAmbulance) {
                System.out.println("Error: Required medical supplies not available for RescueMission.");
            }
        }

        @Override
        public void trackMissionProgress() {
            this.status = "IN_PROGRESS";
            System.out.println("Tracking RescueMission milestones... Status: " + status);
        }

        @Override
        public void generateMissionReport() {
            System.out.println("=== Rescue Mission Report ===");
            System.out.println("Mission: " + missionName);
            System.out.println("Status: " + status);
            System.out.println("Personnel: " + assignedPersonnel);
        }
    }





