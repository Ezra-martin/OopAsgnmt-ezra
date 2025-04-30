package MissionManagementSystem;

public class Personnel {
        private String personnelId;
        private String personnelName;
        private String personnelRole;
        private Mission assignedMission;

        public Personnel(String id, String name, String role) {
            this.personnelId = id;
            this.personnelName = name;
            this.personnelRole = role;
        }

        public String getPersonnelId() {
            return personnelId;
        }

        public String getPersonnelName() {
            return personnelName;
        }

        public String getPersonnelRole() {
            return personnelRole;
        }

        public void setAssignedMission(Mission mission) {
            this.assignedMission = mission;
        }

        @Override
        public String toString() {
            return personnelName + " (" + personnelRole + ")";
        }
    }




