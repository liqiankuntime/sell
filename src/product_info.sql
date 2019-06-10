CREATE TABLE "product_info" (
  "product_id" varchar(32) NOT NULL,
  "product_name" varchar(64) NOT NULL,
	"product_price" decimal(8,2) NOT NULL,
  "product_stock" int(11) NOT NULL,
  "product_description" varchar(110) DEFAULT NULL,
  "product_icon" varchar(220) DEFAULT NULL,
  "product_status" TINYINT(1) DEFAULT '0',
  "category_type" int(10) DEFAULT NULL,
	"create_time" TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	"update_time" TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
  PRIMARY KEY ("product_id")
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;