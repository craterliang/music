package com.gmd.util;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101100661239";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCyACm6wVRNxRnP7O5EVn3EkQljYXhei13ny14oPiXJ5CCO+2oulNxtx4d9cHD7CiboX0H/Ud+lOL1w5Lsa1kEhIFk1RoI/HBhNheyd7UDXUpLOv7hMd50/XUYKKcGaAJ6th62fzIGAlyn3BxBscm8pUU9Yf0UdQpWqKbm0pZFWBkDLaawygNAd+1ga1pVzFKVfjlmCahr5fUQfJtKxpD+F4cZ2TeAevHtTPuxPakmk2tx18zv9ItFpa5Jq4/ANIf7xsugDA5O49PO/eUn/BoqiiLwgfK+j3laqz8NhMCChKpjIzKTmivSIRk2RHs9k3nAT/7Tbosy8XGz3t0QSf5uPAgMBAAECggEAHe7zFYnfcHid3557bxiQa9bsGj9Q661KLGnBusjAuBPZ+dGDyLOV4gw0175p8X2Cj389bP9KudEx4mNEp72yFC0Jc3EZBB3oZFkKMoCsb8leENCi4JEY64f2+EyPVyOVi58ObpoIiSRilT0l4ObZlLwsuLgmWkZRPt1ncl6Jc0qv35shPmO4ugHo/3cn31O0F8vUXEcsJQaNaNQdC6w/w1B+ZOFa6AEWfCBNt4r+ILrSyx+YdnXI9HIFfhkIyRgYmAjgd72rwp8UsGD5viFUCpVtg+0srwe4Lw8rpuHtRtKaBbG7pp9QxwH3DovTExDIGozekvo6Kcuz2KNMglAHkQKBgQDnoZG2/ytrQ59zkssiHzQShjE+DrAFa/ldWBlKluQnqFH7/09+JjQuwwocIc6KEY9Yo5JhA9l52Dc4qtpehkspThzF+47/OVLknxg/K2RsFhne99CgyB0Ew38wsr0P14Z8loqkCpcbxhzimjBgYdp9DYrCaLYUTBJ5868qXgbBxwKBgQDEui9G3ATV0aIugU4PyGaRg3GXTaSoZeUIT3v2WfKsrTerTo8TxpduwCGhVH/b09kIhtqU6mohgmiXuH/HyQUFEX4CnCkHnJRM+RWd7fj9T5BVbV2aA9CTdY6faMwel1TJ8BAH9XVEFtvDi7ZAxEF0Qp50CysJ+D9pcwll1VnX+QKBgDJbhfpq712ajgfqWg9JCWEdm4cKWmpTVxtcE+OLen7EsU4/62BZne6sqH4FO4n411lF9oTw+U7sGtVPD7qNJ7oLKWZBko0aQVNC41qYbHSzOVyoM8tAtk5a0kQcF85h5PMhJ3MSelencpAxRWMu4vldAFXTvgIbp8irmeF0H7PxAoGAIG5hJNlYorcweWIvsEJlRk/ZBgxyvKAvpbMUyIQDkZvstXz58VSn2kYqRSJdAaxm9xTkK/CJFoUdIQX1asYk4bUEhQGhcfPKLvZRLfvxNDFNpgeliqJeXDDhFj58h/6Cp9e/jNBWSKdMC2yY2wx/jd79qDu/GKGoMoYYYoVNjmECgYEApCWnkQ8F9toStnjOh2ipDWGo4CztJ5KfeFUOkrXq4CnbVFHwkCioxXjfbYLvnls6HeJ5k3Ri9pY+3x0BeWsscS4WkyhKKofIpa4p5h0VqEnMxrsOf6THIbeXSFZTe/NcAYZD2W1jPhPYhrl448lZnSWReXkkWJiPbHk/O6L/ai8=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAiDqgPh4hDqtO0Kd2iyhEPmKiPVYRn0CRsNFgrmpWb8fA9x4ky3c5u81OaxpHH+BMRJ/GMpuqezp0bHwgETSNwTaO3tYqi1w3gnIHIG5j9JBcZ5JjPWbPpIGUDgfwPB5mbqUSltogxj/nwp/PJOD1DyH+p3n2swP4XKCO7tB4ezhH78DbrcpI6CcgrpGr8JCRy6+Vd30ywz+Rs73Oa7rSiLgNnl9iWLJISDxapl8V+rTbgGpDj+mcaCb6+cdxgBdJ54ZXo+DZ0x6lA+OfWf4Bz9K5nHzLK6yuR5sCAEDTw52LyA4b5FF3hENplNy2AiAZqxvGlFiNJupf4UuPh2jv0QIDAQAB";
	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8082/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8082/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

