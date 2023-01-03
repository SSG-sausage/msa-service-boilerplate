DROP TABLE IF EXISTS `example`;

CREATE TABLE `example`
(
    `ID`       bigint   NOT NULL AUTO_INCREMENT,
    `REG_DTS`  datetime NOT NULL,
    `MOD_DTS`  datetime NOT NULL,
    `REGPE_ID` bigint,
    `MODPE_ID` bigint,
        primary key (`ID`)
);