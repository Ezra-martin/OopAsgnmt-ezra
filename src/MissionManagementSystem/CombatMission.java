package MissionManagementSystem;

import java.util.Date;
import java.util.List;

    public class CombatMission extends Mission {
        public CombatMission(String id, String name, Date startDate, Date endDate) {
            super(id, name, startDate, endDate);
        }

        @Override
        public void assignTask() {
            if (assignedPersonnel.size() < 3) {
                System.out.println("Error: At least 3 personnel required for CombatMission.");
                return;
            }
            System.out.println("Combat tasks (defense, attack, strategy) assigned.");
        }

        @Override
        public void allocateResources(List<Resource> resources) {
            boolean hasAmmo = false;
            boolean hasVehicle = false;

            for (Resource res : resources) {
                if (res.getResourceName().equalsIgnoreCase("Ammunition") && res.isAvailable(1)) {
                    res.allocate(1);
                    hasAmmo = true;
                }
                if (res.getResourceName().equalsIgnoreCase("Vehicle") && res.isAvailable(1)) {
                    res.allocate(1);
                    hasVehicle = true;
                }
            }

            if (!hasAmmo || !hasVehicle) {
                System.out.println("Error: Necessary combat resources not available.");
            }
        }

        @Override
        public void trackMissionProgress() {
            this.status = "IN_PROGRESS";
            System.out.println("Tracking combat results... Status: " + status);
        }

        @Override
        public void generateMissionReport() {
            System.out.println("=== Combat Mission Report ===");
            System.out.println("Mission: " + missionName);
            System.out.println("Status: " + status);
            System.out.println("Personnel: " + assignedPersonnel);
        }
    }




