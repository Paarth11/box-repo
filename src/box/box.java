package box;

public class box {
    int height;
    int width;
    int length;
    box(){
        this.height = -1;
        this.width = -1;
        this.length = -1;
    }
    box(int height,int width,int length){
        this.height=height;
        this.width=width;
        this.length=length;
    }
    box(box old){
        old.length=length;
        old.width=width;
        old.height=height;
    }


}
