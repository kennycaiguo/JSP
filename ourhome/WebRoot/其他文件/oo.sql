USE [mydb]
GO
/****** Object:  Table [dbo].[userinfo]    Script Date: 03/30/2017 11:34:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[userinfo](
	[uid] [int] NOT NULL,
	[uame] [varchar](50) NOT NULL,
	[upsw] [varchar](20) NOT NULL,
	[urealname] [varchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[uid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[userinfo] ([uid], [uame], [upsw], [urealname]) VALUES (1, N'lium', N'lium', N'刘明')
INSERT [dbo].[userinfo] ([uid], [uame], [upsw], [urealname]) VALUES (2, N'admin', N'admin', N'刘丽')
INSERT [dbo].[userinfo] ([uid], [uame], [upsw], [urealname]) VALUES (3, N'liuh', N'liuh', N'刘华')
INSERT [dbo].[userinfo] ([uid], [uame], [upsw], [urealname]) VALUES (4, N'123', N'123', N'123')
/****** Object:  Table [dbo].[userHome]    Script Date: 03/30/2017 11:34:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[userHome](
	[uid] [int] NULL,
	[username] [nchar](10) NOT NULL,
	[password] [nchar](10) NOT NULL
) ON [PRIMARY]
GO
INSERT [dbo].[userHome] ([uid], [username], [password]) VALUES (1, N'admin     ', N'admin     ')
/****** Object:  Table [dbo].[houseinfo]    Script Date: 03/30/2017 11:34:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[houseinfo](
	[hid] [int] IDENTITY(1,1) NOT NULL,
	[uid] [int] NULL,
	[harea] [varchar](50) NOT NULL,
	[hname] [varchar](100) NOT NULL,
	[hfx] [varchar](50) NOT NULL,
	[hmj] [varchar](50) NOT NULL,
	[hzx] [varchar](50) NOT NULL,
	[hlc] [varchar](20) NOT NULL,
	[hzj] [varchar](20) NOT NULL,
	[hfd] [varchar](20) NOT NULL,
	[hfdtel] [varchar](50) NOT NULL,
	[hqk] [varchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[hid] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[houseinfo] ON
INSERT [dbo].[houseinfo] ([hid], [uid], [harea], [hname], [hfx], [hmj], [hzx], [hlc], [hzj], [hfd], [hfdtel], [hqk]) VALUES (1, 1, N'武昌区', N'2', N'3', N'4', N'简装', N'6', N'7', N'8', N'9', N'未出租')
INSERT [dbo].[houseinfo] ([hid], [uid], [harea], [hname], [hfx], [hmj], [hzx], [hlc], [hzj], [hfd], [hfdtel], [hqk]) VALUES (2, 1, N'洪山区', N'2', N'3', N'4', N'精装', N'6', N'7', N'8', N'9', N'未出租')
INSERT [dbo].[houseinfo] ([hid], [uid], [harea], [hname], [hfx], [hmj], [hzx], [hlc], [hzj], [hfd], [hfdtel], [hqk]) VALUES (3, 1, N'武昌区', N'2', N'3', N'4', N'毛坯', N'6', N'7', N'8', N'9', N'已出租')
INSERT [dbo].[houseinfo] ([hid], [uid], [harea], [hname], [hfx], [hmj], [hzx], [hlc], [hzj], [hfd], [hfdtel], [hqk]) VALUES (4, 1, N'洪山区', N'ss', N'123', N'123', N'简装', N'12', N'213', N'123', N'123', N'未出租')
INSERT [dbo].[houseinfo] ([hid], [uid], [harea], [hname], [hfx], [hmj], [hzx], [hlc], [hzj], [hfd], [hfdtel], [hqk]) VALUES (5, 1, N'洪山区', N'sssss', N'111', N'1', N'简装', N'1', N'1', N'1', N'12', N'已出租')
SET IDENTITY_INSERT [dbo].[houseinfo] OFF
/****** Object:  ForeignKey [fk_uid]    Script Date: 03/30/2017 11:34:01 ******/
ALTER TABLE [dbo].[houseinfo]  WITH CHECK ADD  CONSTRAINT [fk_uid] FOREIGN KEY([uid])
REFERENCES [dbo].[userinfo] ([uid])
GO
ALTER TABLE [dbo].[houseinfo] CHECK CONSTRAINT [fk_uid]
GO
