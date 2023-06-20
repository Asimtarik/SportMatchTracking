package com.mycompany.sportmatchtracking;

import com.mycompany.sportmatchtracking.Team;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-06-19T00:07:38", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Matches.class)
public class Matches_ { 

    public static volatile SingularAttribute<Matches, Integer> score2;
    public static volatile SingularAttribute<Matches, Team> team1;
    public static volatile SingularAttribute<Matches, Team> team2;
    public static volatile SingularAttribute<Matches, String> matchtype;
    public static volatile SingularAttribute<Matches, Integer> score1;
    public static volatile SingularAttribute<Matches, Integer> matchid;

}