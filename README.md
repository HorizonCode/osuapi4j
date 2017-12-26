# osuapi4j
tired of using json to just read the pp stats of a user?
this API gets you rid of the torture, easy to use and implement into your Project

## Download
Download the latest Binary [here](https://github.com/HorizonCode/osuapi4j/releases/latest)

## How to use?

```java
private static osuAPI api;

public static void main(String[] args) {
 api = new osuAPI("your api key");

 User horizon = api.getUserByID(5466785);
 User horizon2 = api.getUserByName("HorizonCode");

 System.out.println("horizon pp: " + horizon.getPP());
 System.out.println("horizon2 pp: " + horizon2.getPP());

 Beatmap beatmap = api.getBeatmapByID(1483372);
 System.out.println("CS " + beatmap.getCS());
 System.out.println("OD " + beatmap.getOD());
 System.out.println("AR " + beatmap.getAR());
 System.out.println("HP " + beatmap.getHP());

 BeatmapSet beatmapSet = api.getBeatmapSetByID(700726);
 for (Beatmap beatmap: beatmapSet.getBeatmaps()) {
  System.out.println("Difficulty: " + beatmap.getDifficultyName());
  System.out.println("CS " + beatmap.getCS());
  System.out.println("OD " + beatmap.getOD());
  System.out.println("AR " + beatmap.getAR());
  System.out.println("HP " + beatmap.getHP());
 }
}
```

# More like Beatmaps or Scorelisting soon
