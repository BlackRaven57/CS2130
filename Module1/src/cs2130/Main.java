package cs2130;

public class Main {

  public static void main(String[] args) {
    char p;
    char q;
    char r;
    // Truth Table - Proposition 1
    System.out.println("p\tq\tr\t(p ^ q)\t(r v p)\t-(r v p)\t(p ^ q) v -(r v p)");
    p = 'T'; q = 'T'; r = 'T';
    System.out.println(p + "\t" + q + "\t" + r + "\t" + Logic.Conjunction(p, q) + "\t\t" + Logic.Disjunction(r, p) + "\t\t" + Logic.Negation(Logic.Disjunction(r, p)) + "\t\t\t" + Logic.Proposition1(p, q, r));
    p = 'T'; q = 'T'; r = 'F';
    System.out.println(p + "\t" + q + "\t" + r + "\t" + Logic.Conjunction(p, q) + "\t\t" + Logic.Disjunction(r, p) + "\t\t" + Logic.Negation(Logic.Disjunction(r, p)) + "\t\t\t" + Logic.Proposition1(p, q, r));
    p = 'T'; q = 'F'; r = 'T';
    System.out.println(p + "\t" + q + "\t" + r + "\t" + Logic.Conjunction(p, q) + "\t\t" + Logic.Disjunction(r, p) + "\t\t" + Logic.Negation(Logic.Disjunction(r, p)) + "\t\t\t" + Logic.Proposition1(p, q, r));
    p = 'T'; q = 'F'; r = 'F';
    System.out.println(p + "\t" + q + "\t" + r + "\t" + Logic.Conjunction(p, q) + "\t\t" + Logic.Disjunction(r, p) + "\t\t" + Logic.Negation(Logic.Disjunction(r, p)) + "\t\t\t" + Logic.Proposition1(p, q, r));
    p = 'F'; q = 'T'; r = 'T';
    System.out.println(p + "\t" + q + "\t" + r + "\t" + Logic.Conjunction(p, q) + "\t\t" + Logic.Disjunction(r, p) + "\t\t" + Logic.Negation(Logic.Disjunction(r, p)) + "\t\t\t" + Logic.Proposition1(p, q, r));
    p = 'F'; q = 'T'; r = 'F';
    System.out.println(p + "\t" + q + "\t" + r + "\t" + Logic.Conjunction(p, q) + "\t\t" + Logic.Disjunction(r, p) + "\t\t" + Logic.Negation(Logic.Disjunction(r, p)) + "\t\t\t" + Logic.Proposition1(p, q, r));
    p = 'F'; q = 'F'; r = 'T';
    System.out.println(p + "\t" + q + "\t" + r + "\t" + Logic.Conjunction(p, q) + "\t\t" + Logic.Disjunction(r, p) + "\t\t" + Logic.Negation(Logic.Disjunction(r, p)) + "\t\t\t" + Logic.Proposition1(p, q, r));
    p = 'F'; q = 'F'; r = 'F';
    System.out.println(p + "\t" + q + "\t" + r + "\t" + Logic.Conjunction(p, q) + "\t\t" + Logic.Disjunction(r, p) + "\t\t" + Logic.Negation(Logic.Disjunction(r, p)) + "\t\t\t" + Logic.Proposition1(p, q, r));

    // Truth Table - Proposition 2
    System.out.println("\n\np\tq\tr\t(q v p)\t(-p ^ r)\t(q v p) -> (-p ^ r)");
    p = 'T'; q = 'T'; r = 'T';
    System.out.println(p + "\t" + q + "\t" + r + "\t" + Logic.Disjunction(p, q) + "\t\t" + Logic.Conjunction(Logic.Negation(p), r) + "\t\t\t" + Logic.Proposition2(p, q, r));
    p = 'T'; q = 'T'; r = 'F';
    System.out.println(p + "\t" + q + "\t" + r + "\t" + Logic.Disjunction(p, q) + "\t\t" + Logic.Conjunction(Logic.Negation(p), r) + "\t\t\t" + Logic.Proposition2(p, q, r));
    p = 'T'; q = 'F'; r = 'T';
    System.out.println(p + "\t" + q + "\t" + r + "\t" + Logic.Disjunction(p, q) + "\t\t" + Logic.Conjunction(Logic.Negation(p), r) + "\t\t\t" + Logic.Proposition2(p, q, r));
    p = 'T'; q = 'F'; r = 'F';
    System.out.println(p + "\t" + q + "\t" + r + "\t" + Logic.Disjunction(p, q) + "\t\t" + Logic.Conjunction(Logic.Negation(p), r) + "\t\t\t" + Logic.Proposition2(p, q, r));
    p = 'F'; q = 'T'; r = 'T';
    System.out.println(p + "\t" + q + "\t" + r + "\t" + Logic.Disjunction(p, q) + "\t\t" + Logic.Conjunction(Logic.Negation(p), r) + "\t\t\t" + Logic.Proposition2(p, q, r));
    p = 'F'; q = 'T'; r = 'F';
    System.out.println(p + "\t" + q + "\t" + r + "\t" + Logic.Disjunction(p, q) + "\t\t" + Logic.Conjunction(Logic.Negation(p), r) + "\t\t\t" + Logic.Proposition2(p, q, r));
    p = 'F'; q = 'F'; r = 'T';
    System.out.println(p + "\t" + q + "\t" + r + "\t" + Logic.Disjunction(p, q) + "\t\t" + Logic.Conjunction(Logic.Negation(p), r) + "\t\t\t" + Logic.Proposition2(p, q, r));
    p = 'F'; q = 'F'; r = 'F';
    System.out.println(p + "\t" + q + "\t" + r + "\t" + Logic.Disjunction(p, q) + "\t\t" + Logic.Conjunction(Logic.Negation(p), r) + "\t\t\t" + Logic.Proposition2(p, q, r));

    // Truth Table - Proposition 3
    System.out.println("\n\np\tq\tr\t(p <-> r)\t(q ^ -p)\t(p <-> r) v (q ^ -p)");
    p = 'T'; q = 'T'; r = 'T';
    System.out.println(p + "\t" + q + "\t" + r + "\t" + Logic.Biconditional(p, r) + "\t\t\t" + Logic.Conjunction(Logic.Negation(p), q) + "\t\t\t" + Logic.Proposition3(p, q, r));
    p = 'T'; q = 'T'; r = 'F';
    System.out.println(p + "\t" + q + "\t" + r + "\t" + Logic.Biconditional(p, r) + "\t\t\t" + Logic.Conjunction(Logic.Negation(p), q) + "\t\t\t" + Logic.Proposition3(p, q, r));
    p = 'T'; q = 'F'; r = 'T';
    System.out.println(p + "\t" + q + "\t" + r + "\t" + Logic.Biconditional(p, r) + "\t\t\t" + Logic.Conjunction(Logic.Negation(p), q) + "\t\t\t" + Logic.Proposition3(p, q, r));
    p = 'T'; q = 'F'; r = 'F';
    System.out.println(p + "\t" + q + "\t" + r + "\t" + Logic.Biconditional(p, r) + "\t\t\t" + Logic.Conjunction(Logic.Negation(p), q) + "\t\t\t" + Logic.Proposition3(p, q, r));
    p = 'F'; q = 'T'; r = 'T';
    System.out.println(p + "\t" + q + "\t" + r + "\t" + Logic.Biconditional(p, r) + "\t\t\t" + Logic.Conjunction(Logic.Negation(p), q) + "\t\t\t" + Logic.Proposition3(p, q, r));
    p = 'F'; q = 'T'; r = 'F';
    System.out.println(p + "\t" + q + "\t" + r + "\t" + Logic.Biconditional(p, r) + "\t\t\t" + Logic.Conjunction(Logic.Negation(p), q) + "\t\t\t" + Logic.Proposition3(p, q, r));
    p = 'F'; q = 'F'; r = 'T';
    System.out.println(p + "\t" + q + "\t" + r + "\t" + Logic.Biconditional(p, r) + "\t\t\t" + Logic.Conjunction(Logic.Negation(p), q) + "\t\t\t" + Logic.Proposition3(p, q, r));
    p = 'F'; q = 'F'; r = 'F';
    System.out.println(p + "\t" + q + "\t" + r + "\t" + Logic.Biconditional(p, r) + "\t\t\t" + Logic.Conjunction(Logic.Negation(p), q) + "\t\t\t" + Logic.Proposition3(p, q, r));

    int x;
    int y;
    int z;
    // Truth Table - Boolean Expression 1
    System.out.println("\n\nx\ty\tz\t(x + y)\t(zx)\t(x + y) + (zx) + y");
    x = 1; y = 1; z = 1;
    System.out.println(x + "\t" + y + "\t" + z + "\t" + Boolean.Add(x, y) + "\t\t" + Boolean.Multiply(z, x) + "\t\t" + Boolean.Expression1(x, y, z));
    x = 1; y = 1; z = 0;
    System.out.println(x + "\t" + y + "\t" + z + "\t" + Boolean.Add(x, y) + "\t\t" + Boolean.Multiply(z, x) + "\t\t" + Boolean.Expression1(x, y, z));
    x = 1; y = 0; z = 1;
    System.out.println(x + "\t" + y + "\t" + z + "\t" + Boolean.Add(x, y) + "\t\t" + Boolean.Multiply(z, x) + "\t\t" + Boolean.Expression1(x, y, z));
    x = 1; y = 0; z = 0;
    System.out.println(x + "\t" + y + "\t" + z + "\t" + Boolean.Add(x, y) + "\t\t" + Boolean.Multiply(z, x) + "\t\t" + Boolean.Expression1(x, y, z));
    x = 0; y = 1; z = 1;
    System.out.println(x + "\t" + y + "\t" + z + "\t" + Boolean.Add(x, y) + "\t\t" + Boolean.Multiply(z, x) + "\t\t" + Boolean.Expression1(x, y, z));
    x = 0; y = 1; z = 0;
    System.out.println(x + "\t" + y + "\t" + z + "\t" + Boolean.Add(x, y) + "\t\t" + Boolean.Multiply(z, x) + "\t\t" + Boolean.Expression1(x, y, z));
    x = 0; y = 0; z = 1;
    System.out.println(x + "\t" + y + "\t" + z + "\t" + Boolean.Add(x, y) + "\t\t" + Boolean.Multiply(z, x) + "\t\t" + Boolean.Expression1(x, y, z));
    x = 0; y = 0; z = 0;
    System.out.println(x + "\t" + y + "\t" + z + "\t" + Boolean.Add(x, y) + "\t\t" + Boolean.Multiply(z, x) + "\t\t" + Boolean.Expression1(x, y, z));

    // Truth Table - Boolean Expression 2
    System.out.println("\n\nx\ty\tz\tx'y'\t(z + y)\tx'y' + (z + y)");
    x = 1; y = 1; z = 1;
    System.out.println(x + "\t" + y + "\t" + z + "\t" + Boolean.Multiply(Boolean.Complement(x), Boolean.Complement(y)) + "\t\t" + Boolean.Add(z, y) + "\t\t" + Boolean.Expression2(x, y, z));
    x = 1; y = 1; z = 0;
    System.out.println(x + "\t" + y + "\t" + z + "\t" + Boolean.Multiply(Boolean.Complement(x), Boolean.Complement(y)) + "\t\t" + Boolean.Add(z, y) + "\t\t" + Boolean.Expression2(x, y, z));
    x = 1; y = 0; z = 1;
    System.out.println(x + "\t" + y + "\t" + z + "\t" + Boolean.Multiply(Boolean.Complement(x), Boolean.Complement(y)) + "\t\t" + Boolean.Add(z, y) + "\t\t" + Boolean.Expression2(x, y, z));
    x = 1; y = 0; z = 0;
    System.out.println(x + "\t" + y + "\t" + z + "\t" + Boolean.Multiply(Boolean.Complement(x), Boolean.Complement(y)) + "\t\t" + Boolean.Add(z, y) + "\t\t" + Boolean.Expression2(x, y, z));
    x = 0; y = 1; z = 1;
    System.out.println(x + "\t" + y + "\t" + z + "\t" + Boolean.Multiply(Boolean.Complement(x), Boolean.Complement(y)) + "\t\t" + Boolean.Add(z, y) + "\t\t" + Boolean.Expression2(x, y, z));
    x = 0; y = 1; z = 0;
    System.out.println(x + "\t" + y + "\t" + z + "\t" + Boolean.Multiply(Boolean.Complement(x), Boolean.Complement(y)) + "\t\t" + Boolean.Add(z, y) + "\t\t" + Boolean.Expression2(x, y, z));
    x = 0; y = 0; z = 1;
    System.out.println(x + "\t" + y + "\t" + z + "\t" + Boolean.Multiply(Boolean.Complement(x), Boolean.Complement(y)) + "\t\t" + Boolean.Add(z, y) + "\t\t" + Boolean.Expression2(x, y, z));
    x = 0; y = 0; z = 0;
    System.out.println(x + "\t" + y + "\t" + z + "\t" + Boolean.Multiply(Boolean.Complement(x), Boolean.Complement(y)) + "\t\t" + Boolean.Add(z, y) + "\t\t" + Boolean.Expression2(x, y, z));

    // Truth Table - Boolean Expression 3
    System.out.println("\n\nx\ty\tz\t(x + y)'\t(y + x')\txy'z\t(x + y)'(y + x') + xy'z");
    x = 1; y = 1; z = 1;
    System.out.println(x + "\t" + y + "\t" + z + "\t" + Boolean.Complement(Boolean.Add(x, y)) + "\t\t\t" + Boolean.Add(y, Boolean.Complement(x)) + "\t\t\t" + Boolean.Multiply(Boolean.Multiply(x, Boolean.Complement(y)), z) + "\t\t" + Boolean.Expression3(x, y, z));
    x = 1; y = 1; z = 0;
    System.out.println(x + "\t" + y + "\t" + z + "\t" + Boolean.Complement(Boolean.Add(x, y)) + "\t\t\t" + Boolean.Add(y, Boolean.Complement(x)) + "\t\t\t" + Boolean.Multiply(Boolean.Multiply(x, Boolean.Complement(y)), z) + "\t\t" + Boolean.Expression3(x, y, z));
    x = 1; y = 0; z = 1;
    System.out.println(x + "\t" + y + "\t" + z + "\t" + Boolean.Complement(Boolean.Add(x, y)) + "\t\t\t" + Boolean.Add(y, Boolean.Complement(x)) + "\t\t\t" + Boolean.Multiply(Boolean.Multiply(x, Boolean.Complement(y)), z) + "\t\t" + Boolean.Expression3(x, y, z));
    x = 1; y = 0; z = 0;
    System.out.println(x + "\t" + y + "\t" + z + "\t" + Boolean.Complement(Boolean.Add(x, y)) + "\t\t\t" + Boolean.Add(y, Boolean.Complement(x)) + "\t\t\t" + Boolean.Multiply(Boolean.Multiply(x, Boolean.Complement(y)), z) + "\t\t" + Boolean.Expression3(x, y, z));
    x = 0; y = 1; z = 1;
    System.out.println(x + "\t" + y + "\t" + z + "\t" + Boolean.Complement(Boolean.Add(x, y)) + "\t\t\t" + Boolean.Add(y, Boolean.Complement(x)) + "\t\t\t" + Boolean.Multiply(Boolean.Multiply(x, Boolean.Complement(y)), z) + "\t\t" + Boolean.Expression3(x, y, z));
    x = 0; y = 1; z = 0;
    System.out.println(x + "\t" + y + "\t" + z + "\t" + Boolean.Complement(Boolean.Add(x, y)) + "\t\t\t" + Boolean.Add(y, Boolean.Complement(x)) + "\t\t\t" + Boolean.Multiply(Boolean.Multiply(x, Boolean.Complement(y)), z) + "\t\t" + Boolean.Expression3(x, y, z));
    x = 0; y = 0; z = 1;
    System.out.println(x + "\t" + y + "\t" + z + "\t" + Boolean.Complement(Boolean.Add(x, y)) + "\t\t\t" + Boolean.Add(y, Boolean.Complement(x)) + "\t\t\t" + Boolean.Multiply(Boolean.Multiply(x, Boolean.Complement(y)), z) + "\t\t" + Boolean.Expression3(x, y, z));
    x = 0; y = 0; z = 0;
    System.out.println(x + "\t" + y + "\t" + z + "\t" + Boolean.Complement(Boolean.Add(x, y)) + "\t\t\t" + Boolean.Add(y, Boolean.Complement(x)) + "\t\t\t" + Boolean.Multiply(Boolean.Multiply(x, Boolean.Complement(y)), z) + "\t\t" + Boolean.Expression3(x, y, z));


  }
}
