package chap_07.camera;

public final class ActionCam extends Camera { // final : 상속을 못하도록 막음.
    public final String lens; // = "광각렌즈"; // final : 값 바꾸지 못하도록 막음.

    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈";
    }

    public final void makeVideo() { // final : 자식 클래스에서 오버라이딩 못하도록 막음.
        System.out.println(this.name + " : " + this.lens + "로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
    }
}
