package org.pavlov.matrixserver.domain.tech;

/**
 * Created by Василий on 25.04.2015.
 */

import javax.persistence.*;

@Entity
@Table(name = "techobjects",schema = "tech")
public class TechObject {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Basic(optional = false)
    @Column(name = "TECHOBJECT_ID",nullable = false,unique = true)
    private Long id;







}
