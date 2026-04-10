package test22;

public class Main {

    private void run() {
        while(true) {
            try {
                Html html = new Html();
                WaitThread bfw = new WaitThread();
                html.setBody("<h1>안녕하세요. 메모리 테스트 중입니다.</h1>");
                System.out.println("Push Html");

                bfw.setHtml(html);
                bfw.start();
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class WaitThread extends Thread {
        private Html html = null;

        public void setHtml(Html html) {
            this.html = html;
        }

        @Override
        public void run() {
            try {
                String test = html.toString();
                // test = null;
                // html = null;
                System.out.println("html file write...");
                sleep(60 * 1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
