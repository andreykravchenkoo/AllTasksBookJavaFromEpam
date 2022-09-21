package project;

public class Mobile {
    private String brand;
    private String model;
    private ModelProperties modelProperties;

    public Mobile(String brand, String model, ModelProperties modelProperties) {
        this.brand = brand;
        this.model = model;
        this.modelProperties = modelProperties;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ModelProperties getModelProperties() {
        return modelProperties;
    }

    public void setModelProperties(ModelProperties modelProperties) {
        this.modelProperties = modelProperties;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", modelProperties=" + modelProperties +
                '}';
    }

    public static class ModelProperties {
        private int accumSize;
        private double screenSize;
        private int RAM;
        private int memory;
        private int price;

        public ModelProperties(int accumSize, double screenSize, int RAM, int memory, int price) {
            this.accumSize = accumSize;
            this.screenSize = screenSize;
            this.RAM = RAM;
            this.memory = memory;
            this.price = price;
        }

        public int getAccumSize() {
            return accumSize;
        }

        public void setAccumSize(int accumSize) {
            this.accumSize = accumSize;
        }

        public double getScreenSize() {
            return screenSize;
        }

        public void setScreenSize(double screenSize) {
            this.screenSize = screenSize;
        }

        public int getRAM() {
            return RAM;
        }

        public void setRAM(int RAM) {
            this.RAM = RAM;
        }

        public int getMemory() {
            return memory;
        }

        public void setMemory(int memory) {
            this.memory = memory;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "ModelProperties{" +
                    "accumSize=" + accumSize +
                    ", screenSize=" + screenSize +
                    ", RAM=" + RAM +
                    ", memory=" + memory +
                    ", price=" + price +
                    '}';
        }
    }
}
