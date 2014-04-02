package com.dianping.cat.report.page.test;

import com.dianping.cat.report.ReportPage;
import org.unidal.web.mvc.view.BaseJspViewer;

public class JspViewer extends BaseJspViewer<ReportPage, Action, Context, Model> {
	@Override
	protected String getJspFilePath(Context ctx, Model model) {
		Action action = model.getAction();

		switch (action) {
		case INSERT:
			return JspFile.INSERT_VIEW.getPath();
		case QUERY:
			return JspFile.QUERY_VIEW.getPath();
		}

		throw new RuntimeException("Unknown action: " + action);
	}
}
