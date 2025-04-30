package MissionManagementSystem;

import java.util.Date;
import java.util.List;

    public class ReconMission extends Mission {
        public ReconMission(String id, String name, Date startDate, Date endDate) {
            super(id, name, startDate, endDate);
        }

        @Override
        public void assignTask() {
            if (assignedPersonnel.size() < 2) {
                System.out.println("Error: At least 2 personnel required for ReconMission.");
                return;
            }
            System.out.println("Recon tasks (surveillance, intel gathering) assigned.");
        }

        @Override
        public void allocateResources(List<Resource> resources) {
            boolean droneAvailable = false;
            for (Resource res : resources) {
                if (res.getResourceName().equalsIgnoreCase("Drone") && res.isAvailable(1)) {
                    res.allocate(1);
                    droneAvailable = true;
                }
            }
            if (!droneAvailable) {
                System.out.println("Error: No drones available for ReconMission.");
            }
        }

        @Override
        public void trackMissionProgress() {
            this.status = "IN_PROGRESS";
            System.out.println("Tracking recon mission... Status: " + status);
        }

        @Override
        public void generateMissionReport() {
            System.out.println("=== Recon Mission Report ===");
            System.out.println("Mission: " + missionName);
            System.out.println("Status: " + status);
            System.out.println("Personnel: " + assignedPersonnel);
        }
    }




