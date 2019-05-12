package com.tech.selenium.tests;

import com.tech.selenium.stepdefinitions.GoogleSteps;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.failures.FailureStrategy;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import java.util.Arrays;
import java.util.List;

public class GoogleMapper extends JUnitStories {

    @Override
    public Embedder configuredEmbedder() {
        final Embedder embedder = new Embedder();
        embedder.embedderControls()
                .useThreads(1)
                .doGenerateViewAfterStories(true)
                .doIgnoreFailureInStories(false)
                .doIgnoreFailureInView(false)
                .doVerboseFailures(true);

        final Configuration configuration = configuration();

        embedder.useConfiguration(configuration);
        embedder.useStepsFactory(stepsFactory());

        return embedder;
    }

    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration()
                .useStoryLoader(
                        new LoadFromClasspath(this.getClass())
                )
                .useFailureStrategy(new FailureStrategy() {

                    @Override
                    public void handleFailure(Throwable throwable) throws Throwable {
                        throw throwable;
                    }
                })
                .useStoryReporterBuilder(
                        new StoryReporterBuilder().withCodeLocation(
                                CodeLocations.codeLocationFromClass(this.getClass())
                        )
                                .withFormats(
                                        Format.TXT,
                                        Format.CONSOLE
                                )
                                .withFailureTrace(true)
                );
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new GoogleSteps());
    }

    protected List<String> storyPaths() {
        return Arrays.asList("stories/Google.story");
    }
}
