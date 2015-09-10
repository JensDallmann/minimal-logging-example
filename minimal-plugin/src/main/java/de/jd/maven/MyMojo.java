package de.jd.maven;

import de.jd.legacyComponent.WildLogging;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "compile", defaultPhase = LifecyclePhase.COMPILE)
public class MyMojo extends AbstractMojo {

  @Override
  public void execute() throws MojoExecutionException, MojoFailureException {
    new WildLogging();
  }
}
