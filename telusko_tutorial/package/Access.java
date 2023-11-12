public class Access {
    
    // private variable and methods are accessible within  the same class
    private int x;

    // public variable and methods are accessible  to sub-class , within package and outside package
    // that means public variable and methods accessible everywhere
    public int y;

    // protected variable and methods are accessible to same class, same class sub-class, same package sub-class
    // different package sub-class
    protected int z;

    // default variable and methods are accessible to same class, same package sub-class and same package non sub-class
    int d;
}
