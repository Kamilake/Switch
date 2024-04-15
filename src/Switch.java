public class Switch {
    public static void main(String[] args) throws Exception {
        System.out.println(handleSwitch(true));
    }

    public static String handleSwitch(boolean enabled) {
      return STR."{\"success\":\"true\", \"message\":\"Switch \{enabled ? "ON" : "OFF"}!\"}";
  }
}
