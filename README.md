# osuapi4j
tired of using json to just read the pp stats of a user?
this API gets you rid of the torture, easy to use and implement into your Project

## How to use?

```java
private static osuAPI api;

public static void main(String[] args){
api = new osuAPI("your api key");

User horizon = api.getUserByID(5466785);
User horizon2 = api.getUserByName("HorizonCode");

System.out.println("horizon pp: " + horizon.getPP());
System.out.println("horizon2 pp: " + horizon2.getPP());
}

```
