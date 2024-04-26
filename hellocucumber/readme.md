# maven bdd
https://cucumber.io/docs/guides/10-minute-tutorial/?lang=java

## construct project

```bash
mvn archetype:generate                      \
   "-DarchetypeGroupId=io.cucumber"           \
   "-DarchetypeArtifactId=cucumber-archetype" \
   "-DarchetypeVersion=7.16.1"               \
   "-DgroupId=hellocucumber"                  \
   "-DartifactId=hellocucumber"               \
   "-Dpackage=hellocucumber"                  \
   "-Dversion=1.0.0-SNAPSHOT"                 \
   "-DinteractiveMode=false"
```

### run test
```bash
mvn test
```



## file system

### Scenario
src/test/resources/hellocucumber/is_it_friday_yet.feature

### code
src/test/java/hellocucumber/StepDefinitions.java