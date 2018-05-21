package nia.chapter1;

import nia.chapter1.BlockingIoExample;

import java.io.IOException;

public class TestBlockingIoExample {
    public static void main(String[] args) throws IOException {
        BlockingIoExample blockingIoExample = new BlockingIoExample();
        while (true) {
            blockingIoExample.serve(9898);
        }
    }
}
