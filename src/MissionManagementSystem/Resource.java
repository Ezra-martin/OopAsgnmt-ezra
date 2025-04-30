package MissionManagementSystem;

public class Resource {
        private String resourceId;
        private String resourceName;
        private int quantity;
        private String resourceType;

        public Resource(String id, String name, int qty, String type) {
            this.resourceId = id;
            this.resourceName = name;
            this.quantity = qty;
            this.resourceType = type;
        }

        public String getResourceName() {
            return resourceName;
        }

        public boolean isAvailable(int requestedQty) {
            return quantity >= requestedQty;
        }

        public void allocate(int usedQty) {
            if (quantity >= usedQty) {
                quantity -= usedQty;
                System.out.println(usedQty + " " + resourceName + " allocated.");
            } else {
                System.out.println("Not enough " + resourceName + " available.");
            }
        }
    }




