package ro.fasttrackit.curs7;

public class Door {
    private boolean open;
    private boolean locked;

    public Door() {
        this.open = false;
        this.locked = true;
    }

    public void openDoor() {
        if (locked) {
            System.out.println("Usa este incuiata, nu se ate deschide");
        } else {
            this.open = true;
        }
    }

    public void closeDoor() {
        this.open = false;
    }

    public void lockDoor() {
        if (open) {
            System.out.println("Door is open, can't lock it");
        } else {
            this.locked = true;
        }
    }
    public void unlockDoor(){
        this.locked = false;
    }
    public boolean isOpened(){
        return open;
    }
    public boolean isLocked(){
        return locked;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
