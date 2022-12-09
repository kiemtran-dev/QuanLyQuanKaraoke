-- BẢNG CHI TIẾT ORDER

USE KARAOKEMANAGEMENT;

CREATE TABLE CHITIETORDER(
	ID_ChiTietOrder 	INT NOT NULL AUTO_INCREMENT,
	ID_Order 			INT NOT NULL,
	ID_SanPham	 		INT NOT NULL,
	SoLuong 			INT NOT NULL,
	PRIMARY KEY (ID_ChiTietOrder),
    FOREIGN KEY (ID_Order) REFERENCES CHITIETPHONG(ID_Order),
    FOREIGN KEY (ID_SanPham) REFERENCES SANPHAM(ID_SanPham) ON DELETE CASCADE
);