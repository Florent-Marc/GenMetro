public class Type {
    private int x;
    private int y;
    private EnumType type;

    public Type(int x, int y, EnumType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public EnumType getType() {
        return this.type;
    }

    public void setType(EnumType enumType) {
        this.type = enumType;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Type && ((Type) obj).getX() == this.getX() && ((Type) obj).getY() == this.getY();
    }


    enum EnumType {
        Station(0xff0000),
        Tunnel(0x511515),
        Croisement(0x00da58),
        StartAndEnd(0x00097e);


        private final int rgb;

        EnumType(int rgb) {
            this.rgb = rgb;
        }


        public int getType() {
            return rgb;
        }
    }
}
