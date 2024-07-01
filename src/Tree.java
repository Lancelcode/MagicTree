public class Tree {
    double hightMeters;
    double ageYears;
    double trunkDiameterCm;
    TreeType treeType;

    void Grow() {
        this.hightMeters = this.hightMeters + 10;
        ageYears += 1;
        trunkDiameterCm += 0.5;
    }
}

