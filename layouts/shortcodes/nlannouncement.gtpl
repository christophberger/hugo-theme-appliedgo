{{ if isset .Site.Params "nlannouncement" }}

<style>
	.nlannouncement {
		color: {{ index (index .Site.Data.panels.announcements .Site.Params.nlannouncement) "fg" }}; background-color:{{ index (index .Site.Data.panels.announcements .Site.Params.nlannouncement) "bg" }}
	}
	.nlannouncement i {
		float:left; 
		padding: 0.5em 0.5em 0.5em 0.5em; 
	}
	.nlannouncement_text {
		padding: 0.5em 0.5em 0.5em 0.5em; 
	}
</style>

<div class="nlannouncement doc" >

	<i class="fa{{ index (index .Site.Data.panels.announcements .Site.Params.nlannouncement) "icon" }} fa-2x" aria-hidden="true" ></i>

	<div class="nlannouncement_text" >
		{{ index (index .Site.Data.panels.announcements .Site.Params.nlannouncement) "text" | markdownify }}
	</div>

</div>
{{ end }}
