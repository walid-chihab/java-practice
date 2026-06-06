public class Vetement {
    // Attributs
    private int id;           // Identifiant unique
    private String name;      // Nom du vêtement
    private String category;  // Catégorie (ex: "T-shirt", "Pantalon")
    private double price;     // Prix
    private int stock;        // Quantité en stock
    private boolean onSale;   // En promotion ou non

    // Constructeur avec paramètres
    public Vetement(int id, String name, String category, double price, int stock, boolean onSale) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.onSale = onSale;
    }

    // Méthode toString pour afficher les informations du vêtement
    @Override
    public String toString() {
        return "Vetement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", onSale=" + onSale +
                '}';
    }

    // Getters et Setters pas demander mais je pense que jaura utiliser
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public boolean isOnSale() { return onSale; }
    public void setOnSale(boolean onSale) { this.onSale = onSale; }
}