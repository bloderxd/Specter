# Specter

![alt tag](http://orig09.deviantart.net/b7f1/f/2013/300/6/5/one_eyed_spectre_animation_by_lissathekitty-d6rmh63.png)

#### Specter is an easy way to convert a payload data to pojo class.

# How does it work?

Well, to tranfer any data to your pojo classes, you need to add some annotations in payload and pojo classes with the same name.

```java
public class Payload {

  @FieldSpect(name = "name")
  private final String name;
  
  public Payload(String name) {
    this.name = name;
  }
}

public class Pojo {

  @FieldSpect(name = "name")
  public final String name;
  
  public Pojo(String name) {
    this.name = name;
  }
}
```

Then you just need to call specter functions to transfer all payload data to pojo.

```java
Payload payload = new Payload("Daniel");
Pojo pojo = new TestPojo("");

pojo = new Specter<Pojo, Payload>()
            .transform(payload)
            .in(pojo)
            .withFieldContext();
```

That's it!
