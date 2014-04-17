
package greenrobot.daogenerator.weisdk;

import greenrobot.daogenerator.weisdk.entity.TestEntity;

import java.io.IOException;

import config.DBConstants;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Schema;

public class WeiSDKDaoGenerator {

    /**
     * 生成的DAO类所在包路径
     */
    private static final String DEFAULT_DAO_PACKAGE = "com.iss.weisdk.dao";

    public static void main(String[] args) throws IOException, Exception {
        Schema schema = new Schema(DBConstants.DATABASE_VERSION, DEFAULT_DAO_PACKAGE);
        addAllSchema(schema);
        new DaoGenerator().generateAll(schema, "../src-gen");
    }

    private static void addAllSchema(Schema schema) {
        TestEntity.addEntity(schema);
    }
}
