CREATE TABLE business_app (
  tenantId NUMERIC(19, 0) NOT NULL,
  id NUMERIC(19, 0) NOT NULL,
  name NVARCHAR(50) NOT NULL,
  version NVARCHAR(50) NOT NULL,
  path NVARCHAR(255) NOT NULL,
  description NVARCHAR(MAX),
  UNIQUE (tenantId, name, version),
  PRIMARY KEY (tenantId, id)
)
GO

CREATE TABLE business_app_page (
  tenantId NUMERIC(19, 0) NOT NULL,
  id NUMERIC(19, 0) NOT NULL,
  businessAppId NUMERIC(19, 0) NOT NULL,
  pageId NUMERIC(19, 0) NOT NULL,
  UNIQUE (tenantId, businessAppId, pageId),
  PRIMARY KEY (tenantId, id)
)
GO

-- forein keys are create in bonita-persistence-db/postCreateStructure.sql