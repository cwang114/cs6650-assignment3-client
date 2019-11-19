public class Constant {
  public static int ENV = 1;      // 0 for local, 1 for ec2 cloud
  public static int MAXIMUM_THREADS = 100;
  public static int NUM_OF_SKIERS = 20000;
  public static int NUM_OF_SKI_LIFTS = 40;
  public static int NUM_OF_SKI_LIFTS_FOR_EACH_SKIER_EACH_DAY = 20;
  public static int PORT = 8080;
  public static int MAXIMUM_MINUTE_LENGTH = 420;
  public static String LOCAL_BASE_URL = "http://127.0.0.1:8080";

  //  AWS single server
  //  public static String EC2_BASE_URL = "http://54.202.199.69:8080/ski-resort-backend";

  //  AWS load balancer
  //  public static String EC2_BASE_URL="http://UltiLB-ab714c397de1be1e.elb.us-west-2.amazonaws.com:8080/ski-resort-backend";

  // Google App Engine
  public static String EC2_BASE_URL="https://distributed-system-hw3.appspot.com";

  public static String CSV_FILE_PATH = "src/main/resources/client_stats.csv";
  public static String EC2_FILE_PATH = "/home/chuxuanwang0823/client_stats.csv";
  public static int START_UP_RUN_FACTOR = (int) (Constant.NUM_OF_SKI_LIFTS_FOR_EACH_SKIER_EACH_DAY * 0.1);
  public static int PEAK_RUN_FACTOR = (int) (Constant.NUM_OF_SKI_LIFTS_FOR_EACH_SKIER_EACH_DAY * 0.8);
  public static int COOLDOWN_RUN_FACTOR = (int) (Constant.NUM_OF_SKI_LIFTS_FOR_EACH_SKIER_EACH_DAY * 0.1);
  public static int START_UP_CRITERIA = (int) Math.ceil(Constant.MAXIMUM_THREADS/4 * 0.1);
  public static int PEAK_CRITERIA = (int) Math.ceil(Constant.MAXIMUM_THREADS * 0.1);
  public static int COOLDOWN_CRITERIA = (int) Math.ceil(Constant.MAXIMUM_THREADS/4 * 0.1);

}
