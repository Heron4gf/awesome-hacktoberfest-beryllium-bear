public class Main {
    public static void main(String[] args) {
        Chain chain = new Chain();

        chain.addBlock(new Block("Hello World"));
        chain.addBlock(new Block("Hello World"));
        chain.addBlock(new Block("Hello World"));

        System.out.println(chain.getBlocks().size());
    }
}