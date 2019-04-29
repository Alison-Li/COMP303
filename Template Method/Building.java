/**
 * Abstract Class or Template
 */
public abstract class Building {
    // Template method
    public final void constructBuilding() {
        constructFoundation();
        constructWalls();
        constructWindows();
    }

    // Methods to be implemented by subclasses
    public abstract void constructFoundation();
    public abstract void constructWalls();
    public abstract void constructWindows();
}