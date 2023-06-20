package com.mycompany.sportmatchtracking;

import com.mycompany.sportmatchtracking.Matches;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-06-19T00:07:38", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Team.class)
public class Team_ { 

    public static volatile SingularAttribute<Team, Integer> score;
    public static volatile SingularAttribute<Team, Integer> tienumber;
    public static volatile SingularAttribute<Team, Integer> losenumber;
    public static volatile SingularAttribute<Team, Integer> winnumber;
    public static volatile SingularAttribute<Team, Integer> teamid;
    public static volatile SingularAttribute<Team, Integer> groupnumber;
    public static volatile SingularAttribute<Team, String> teamtype;
    public static volatile SingularAttribute<Team, String> teamname;
    public static volatile CollectionAttribute<Team, Matches> matchesCollection;
    public static volatile CollectionAttribute<Team, Matches> matchesCollection1;

}