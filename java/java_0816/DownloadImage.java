package java_0816;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DownloadImage {
	public static void main(String[] args) throws Exception {

		String website = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGZUkhY4bkaLxkzDXsI0k_dVgunJ4Iy6dcV_txDfv39lXBmqjXwA";
		// ���ۿ��� �̹��� ã�Ƽ� �̹��� �ּ� ���� => website �� �ٿ��ְ�, �ؿ� �̹��� �̸� ���� ������ Refresh ���ֱ�
		System.out.println("" + website + "����Ʈ���� �̹����� �ٿ�ε��մϴ�.");

		URL url = new URL(website);
		byte[] buffer = new byte[2048];

		try (InputStream in = url.openStream(); OutputStream out = new FileOutputStream("car_2.jpg");) {
			int length = 0;

			while ((length = in.read(buffer)) != -1) {
				System.out.println("" + length + "����Ʈ ��ŭ �о���!");
				out.write(buffer, 0, length);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			System.out.println("���� : " + e.getMessage());
		}

	}

}
