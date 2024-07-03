public class Tree {
    double hightMeters;
    double ageYears;
    double trunkDiameterCm;
    TreeType treeType;

    Tree (double hightMeters, double ageYears, double trunkDiameterCm, TreeType treeType) {
        this.hightMeters = hightMeters;
        this.ageYears = ageYears;
        this.trunkDiameterCm = trunkDiameterCm;
        this.treeType = treeType;
    }

    void Grow() {
        this.hightMeters = this.hightMeters + 10;
        this.trunkDiameterCm = this.trunkDiameterCm + 1;
        this.ageYears = this.ageYears+ 1;
    }

    void CallTallTree() {
        if(this.hightMeters > 20)
        {
            System.out.println("Soy un arbol de " + this.treeType + " muy alto!");
        }
    }
}

