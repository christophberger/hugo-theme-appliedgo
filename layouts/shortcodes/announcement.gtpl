{{ if isset .Site.Params "announcement" }}
<style>
	.announcement {
		color: {{ index (index .Site.Data.panels.announcements .Site.Params.announcement) "fg" }};
		background-color: {{ index (index .Site.Data.panels.announcements .Site.Params.announcement) "bg" }} 
	}
	.announcement i {
		float: left;
		padding: 0.5em 0.5em 0.5em 0.5em;
	}
	.announcement_text {
		padding: 0.5em 0.5em 0.5em 0.5em;
	}
</style>
<div class="announcement doc">
	<i class="fa{{ index (index .Site.Data.panels.announcements .Site.Params.announcement) "icon" }} fa-2x" aria-hidden="true"></i>
	<div class="announcement_text">
		{{ index (index .Site.Data.panels.announcements .Site.Params.announcement) "text" | $.Page.RenderString }}
	</div>
</div>
{{ end }}