package com.tech.selenium.tests;

import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromURL;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.configuration.Configuration;
import java.util.Arrays;
import java.util.List;

public class GoogleMapper extends JUnitStories {

    public GoogleMapper() {
        Configuration configuration = new MostUsefulConfiguration()
                .useStoryLoader(new LoadFromURL());
    }

    @Override
    protected List<String> storyPaths() {
        return Arrays.asList(System.getProperty("user.dir")+"/src/test/resources/stories/Google.story");
    }
}
