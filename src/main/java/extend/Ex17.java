package extend;

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

interface Faxable {
    void fax();
}

class AllInOnePrinter implements Printable, Scannable, Faxable {
    @Override
    public void fax() {
        System.out.println("팩스 전송 중...");
    }

    @Override
    public void print() {
        System.out.println("인쇄 중...");
    }

    @Override
    public void scan() {
        System.out.println("스캔 중...");
    }
}
