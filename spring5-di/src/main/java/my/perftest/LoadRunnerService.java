package my.perftest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoadRunnerService implements LoadRunner {

    @Autowired
    private Library library;
    
    @Override
    public Library getService() {
        return library;
    }

}
