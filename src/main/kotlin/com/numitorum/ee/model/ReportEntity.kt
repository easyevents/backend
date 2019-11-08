package com.numitorum.ee.model

import com.vladmihalcea.hibernate.type.json.JsonBinaryType
import org.hibernate.annotations.Type
import org.hibernate.annotations.TypeDef
import org.hibernate.annotations.TypeDefs
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.SequenceGenerator
import javax.persistence.Table

@Entity
@Table(name = "report")
@TypeDefs(
        TypeDef(name = "jsonb", typeClass = JsonBinaryType::class)
)
class ReportEntity(
        @Id
        @Column(name = "id")
        @SequenceGenerator(
                name = "report_id_generator",
                sequenceName = "report_id_seq",
                allocationSize = 1
        )
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "report_id_generator")
        val id: Long? = null,

        val login: String,

        val lat: Double? = null,
        val lon: Double? = null,
        val address: String? = null
)
