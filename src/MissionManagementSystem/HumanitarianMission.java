package MissionManagementSystem;

import java.util.Date;
import java.util.List;

    public class HumanitarianMission extends Mission {
        public HumanitarianMission(String id, String name, Date startDate, Date endDate) {
            super(id, name, startDate, endDate);
        }

        @Override
        public void assignTask() {
            boolean hasLogisticsOrMedic = assignedPersonnel.stream()
                    .anyMatch(p -> p.getPersonnelRole().equalsIgnoreCase("Logistics Officer")
                            || p.getPersonnelRole().equalsIgnoreCase("Medic"));

            if (!hasLogisticsOrMedic) {
                System.out.println("Error: HumanitarianMission requires logistics or medical personnel.");
                return;
            }

            System.out.println("Tasks for logistics, distribution, and medical aid assigned.");
        }

        @Override
        public void allocateResources(List<Resource> resources) {
            boolean hasFood = false;
            boolean hasMedical = false;

            for (Resource res : resources) {
                if (res.getResourceName().equalsIgnoreCase("Food Supplies") && res.isAvailable(1)) {
                    res.allocate(1);
                    hasFood = true;
                }
                if (res.getResourceName().equalsIgnoreCase("Medical Kit") && res.isAvailable(1)) {
                    res.allocate(1);
                    hasMedical = true;
                }
            }

            if (!hasFood || !hasMedical) {
                System.out.println("Error: Essential humanitarian resources not available.");
            }
        }

        @Override
        public void trackMissionProgress() {
            this.status = "IN_PROGRESS";
            System.out.println("Humanitarian aid delivery in progress. Status: " + status);
        }

        @Override
        public void generateMissionReport() {
            System.out.println("=== Humanitarian Mission Report ===");
            System.out.println("Mission: " + missionName);
            System.out.println("Status: " + status);
            System.out.println("Personnel: " + assignedPersonnel);
        }
    }




