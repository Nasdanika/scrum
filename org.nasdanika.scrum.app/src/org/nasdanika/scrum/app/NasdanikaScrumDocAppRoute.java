
package org.nasdanika.scrum.app;

import org.apache.commons.lang3.StringEscapeUtils;
import org.nasdanika.cdo.web.doc.DocumentationPanelFactory;
import org.nasdanika.html.ApplicationPanel;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.Table;
import org.nasdanika.html.RowContainer.Row;
import org.nasdanika.html.Tag;
import org.nasdanika.html.Tag.TagName;
import org.nasdanika.html.Theme;
import org.nasdanika.html.Bootstrap.Style;
import org.nasdanika.web.Action;
import org.nasdanika.web.HttpServletRequestContext;
import org.nasdanika.web.Route;

public class NasdanikaScrumDocAppRoute implements Route {

	@Override
	public Action execute(HttpServletRequestContext context, Object... args) throws Exception {
		HTMLFactory htmlFactory = HTMLFactory.INSTANCE;
		ApplicationPanel appPanel = htmlFactory.applicationPanel()
				.style(Style.INFO) 
				.header("Nasdanika Scrum Information Center")
				.headerLink(context.getRequest().getContextPath()+"/router/doc.html")
				.style("margin-bottom", "0px")
				.id("docAppPanel");
		
		Table table = htmlFactory.table().style("margin-bottom", "0px");
		Row row = table.row();
		DocumentationPanelFactory documentationPanelFactory = new DocumentationPanelFactory(htmlFactory, context.getContextURL()+"/doc") {

			@Override
			protected Tag tocDiv() {
				return super.tocDiv().style("overflow-y", "scroll");
			}
			
			@Override
			protected Tag searchResultsList() {
				return super.searchResultsList().style("overflow-y", "scroll");
			}
			
		};
		row.cell(documentationPanelFactory.leftPanel()).id("left-panel").style("min-width", "17em");
		row.cell("")
			.id("splitter")
			.style("width", "5px")
			.style("min-width", "5px")
			.style("padding", "0px")
			.style("background", "#d9edf7")
			.style("border", "solid 1px #bce8f1")
			.style("cursor", "col-resize");
		row.cell(documentationPanelFactory.rightPanel()).id("right-panel");
				
		appPanel.contentPanel(
				table, 
				htmlFactory.tag(TagName.script, getClass().getResource("Splitter.js")),
				htmlFactory.tag(TagName.script, getClass().getResource("Scroller.js")),
				htmlFactory.tag(TagName.script, getClass().getResource("SetDimensions.js")));
		
		final AutoCloseable app = htmlFactory.bootstrapRouterApplication(
				Theme.Default,
				StringEscapeUtils.escapeHtml4("Documentation"), 
				null, //"main/doc/index.html", 
				htmlFactory.fragment(
						// --- Stylesheets ---					
						htmlFactory.tag(TagName.link)
							.attribute("rel", "stylesheet")
							.attribute("href", context.getContextURL()+"/doc/bundle/org.nasdanika.web.resources/bootstrap/css/bootstrap.min.css"),							
						htmlFactory.tag(TagName.link)
							.attribute("rel", "stylesheet")
							.attribute("href", context.getContextURL()+"/doc/bundle/org.nasdanika.web.resources/bootstrap/css/bootstrap-theme.min.css"),							
						htmlFactory.tag(TagName.link)
							.attribute("rel", "stylesheet")
							.attribute("href", context.getContextURL()+"/doc/bundle/org.nasdanika.web.resources/font-awesome/css/font-awesome.min.css"),							
						htmlFactory.tag(TagName.link)
							.attribute("rel", "stylesheet")
							.attribute("href", context.getContextURL()+"/doc/bundle/org.nasdanika.web.resources/css/lightbox.css"),							
						htmlFactory.tag(TagName.link)
							.attribute("rel", "stylesheet")
							.attribute("href", context.getContextURL()+"/doc/resources/highlight/styles/github.css"),							
						htmlFactory.tag(TagName.link)
							.attribute("rel", "stylesheet")
							.attribute("href", context.getContextURL()+"/doc/resources/css/github-markdown.css"),							
						htmlFactory.tag(TagName.link)
							.attribute("rel", "stylesheet")
							.attribute("href", context.getContextURL()+"/doc/resources/jstree/themes/default/style.min.css"),
							
						// --- Scripts ---
						htmlFactory.tag(TagName.script).attribute("src", context.getContextURL()+"/doc/bundle/org.nasdanika.web.resources/js/jquery-1.12.1.min.js"),
						htmlFactory.tag(TagName.script).attribute("src", context.getContextURL()+"/doc/bundle/org.nasdanika.web.resources/js/underscore-min.js"),
						htmlFactory.tag(TagName.script).attribute("src", context.getContextURL()+"/doc/bundle/org.nasdanika.web.resources/js/backbone-min.js"),
						htmlFactory.tag(TagName.script).attribute("src", context.getContextURL()+"/doc/bundle/org.nasdanika.web.resources/bootstrap/js/bootstrap.min.js"),
						htmlFactory.tag(TagName.script).attribute("src", context.getContextURL()+"/doc/bundle/org.nasdanika.web.resources/js/d3.min.js"), 				
						htmlFactory.tag(TagName.script).attribute("src", context.getContextURL()+"/doc/bundle/org.nasdanika.web.resources/js/c3.min.js"),												
						htmlFactory.tag(TagName.script).attribute("src", context.getContextURL()+"/doc/bundle/org.nasdanika.web.resources/js/require.js"),
						htmlFactory.tag(TagName.script, htmlFactory.interpolate(getClass().getResource("require-config.js"), "base-url", context.getContextURL()+"/doc/bundle/org.nasdanika.web.resources/js")),
						htmlFactory.tag(TagName.script).attribute("src", context.getContextURL()+"/doc/bundle/org.nasdanika.web.resources/js/lightbox.min.js"),
						htmlFactory.tag(TagName.script).attribute("src", context.getContextURL()+"/doc/resources/highlight/highlight.pack.js")), 				
				appPanel);
		
		return new Action() {
			
			@Override
			public void close() throws Exception {
				app.close();				
			}
			
			@Override
			public Object execute() throws Exception {
				return app.toString();
			}
		};
		
	}

	@Override
	public boolean canExecute() {
		return true;
	}

	@Override
	public void close() throws Exception {
		// NOP
	}

}