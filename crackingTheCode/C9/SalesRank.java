public class SalesRank {

  enum Categories {A, B, C, D, E, F};

  public class Product {
    int id;
    String name;
    String description;
    Categories[] categories;
    public Product(int id, String name) {
      this.id = id;
      this.name = name;
    }

    public int getId() { return id; }
    public int getName() { return name; }
    //  the getters and setters
    // ......
    // ......


  }





















}
