public class ClassXYZ {
    private static ClassXYZ myinstx = null;
    private ClassXYZ() {
    }
    public static ClassXYZ getit() {
        if(myinstx == null){
            myinstx = new ClassXYZ();
        }
        return myinstx;
    }
}
