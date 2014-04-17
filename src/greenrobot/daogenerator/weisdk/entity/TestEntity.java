
package greenrobot.daogenerator.weisdk.entity;

import model.TestModel;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class TestEntity {

    public static void addEntity(Schema schema) {
        // 根据类名称来生成entity
        Entity entity = schema.addEntity(TestEntity.class.getSimpleName());
        // 声明一个自增的主键
        entity.addIdProperty().autoincrement();
        entity.addStringProperty(TestModel.COLUMN_TEST_ID).columnName(TestModel.COLUMN_TEST_ID);
        entity.addStringProperty(TestModel.COLUMN_NAME).columnName(TestModel.COLUMN_NAME);
    }

}
