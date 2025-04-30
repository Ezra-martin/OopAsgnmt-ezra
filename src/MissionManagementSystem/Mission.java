package MissionManagementSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

    public abstract class Mission {
        protected String missionId;
        protected String missionName;
        protected Date missionStartDate;
        protected Date missionEndDate;
        protected String status;
        protected List<Personnel> assignedPersonnel = new ArrayList<>();

        public Mission(String missionId, String missionName, Date missionStartDate, Date missionEndDate) {
            this.missionId = missionId;
            this.missionName = missionName;
            this.missionStartDate = missionStartDate;
            this.missionEndDate = missionEndDate;
            this.status = "PLANNED";
        }

        public void addPersonnel(Personnel p) {
            if (!assignedPersonnel.contains(p)) {
                assignedPersonnel.add(p);
                p.setAssignedMission(this);
            } else {
                System.out.println("Duplicate personnel not allowed.");
            }
        }

        public abstract void assignTask();
        public abstract void allocateResources(List<Resource> resources);
        public abstract void trackMissionProgress();
        public abstract void generateMissionReport();
    }




