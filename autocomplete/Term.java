package autocomplete;

import java.util.Comparator;

public class Term implements Comparable<Term> {

    // Initializes a term with the given query string and weight.
    public Term(String query, long weight){}

    // Compares the two terms in descending order by weight.
    public static Comparator<Term> byReverseWeightOrder()
    {
        return null;
    }
    // Compares the two terms in lexicographic order,
    // but using only the first r characters of each query.
    public static Comparator<Term> byPrefixOrder(int r){return null;}

    // Compares the two terms in lexicographic order by query.
    public int compareTo(Term that){return 1;}
    // Returns a string representation of this term in the following format:
    // the weight, followed by a tab, followed by the query.
    public String toString(){return "";}

    // unit testing (required)
    public static void main(String[] args){}

}