package com.triveratravel.repository;

import com.triveratravel.model.PaymentStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Types;

@Component
public class UpdateReservationQuery extends SqlUpdate {
    private static final String SQL = "UPDATE RESERVATIONS SET STATUS=? WHERE ID=?";

    @Autowired
    public UpdateReservationQuery(DataSource dataSource){
        super(dataSource, SQL);
        declareParameter(new SqlParameter("STATUS", Types.VARCHAR));
        declareParameter(new SqlParameter("ID", Types.NUMERIC));
        compile();
    }

    public int execute(int reservationID, PaymentStatus status){
        return update(status, reservationID);
    }
}
