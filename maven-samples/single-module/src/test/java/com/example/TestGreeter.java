package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.GreaterThan;
import org.mockito.internal.matchers.LessThan;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestGreeter {

  private Greeter greeter;

  @Before
  public void setup() {
    greeter = new Greeter();
  }

  @Test
  public void greetShouldIncludeTheOneBeingGreeted() {
    String someone = "World";

    assertThat(greeter.greet(someone), containsString(someone));
  }
  

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "World";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }

    @Test
  public void greetShouldIncludeGreetingMessage() {
    String someone = "Hello from Agunigbo, Are you enjoying the process? Please answer me!";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }

    @Test
  public void aguokomessage() {
    String someone = "Now I am becoming a pro, hahhahahaha!";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }
}
