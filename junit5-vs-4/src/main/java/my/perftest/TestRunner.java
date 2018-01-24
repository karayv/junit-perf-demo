package my.perftest;

public class TestRunner implements LoadRunner{

    @Override
    public Library getService() {
        return new Library();
    }

}
